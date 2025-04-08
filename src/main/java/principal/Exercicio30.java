package principal;
import model.Aluno;
import javax.swing.JOptionPane;
import java.util.Locale;
/**
 *
 * @author 1072511349
 */
public class Exercicio30 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Aluno aluno1 = new Aluno("aluno", 0, 01, 0.0, 0.0);
        
        aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
        aluno1.setIdade(Integer.parseInt((JOptionPane.showInputDialog("Digite a idade do aluno: "))));
        aluno1.setPeso(Double.parseDouble((JOptionPane.showInputDialog("Digite o peso do aluno: "))));
        aluno1.setAltura(Double.parseDouble((JOptionPane.showInputDialog("Digite a altura do aluno: "))));
        
        JOptionPane.showMessageDialog(null, aluno1.toString());
    }
}
