package $package;

import org.redfx.strange.*;
import org.redfx.strange.gate.*;
import org.redfx.strange.local.SimpleQuantumExecutionEnvironment;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Program p = new Program(2);
        Step step1 = new Step(new X(1));
        p.addStep(step1);
        SimpleQuantumExecutionEnvironment sqee = new SimpleQuantumExecutionEnvironment();
        Result res = sqee.runProgram(p);
        Qubit[] qubits = res.getQubits();
        Arrays.asList(qubits).forEach(q -> System.out.println("qubit with probability on 1 = "+q.getProbability()+", measured it gives "+ q.measure()));
    }

}
