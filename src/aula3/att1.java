package aula3;
import javax.swing.JOptionPane;

public class att1 {
    public static void main(String[] args) {
        String[][] usuarios = new String[40][5];
        usuarios[0][0] = "Flavia Monteiro";usuarios[0][1] = "0123";usuarios[0][2] = "flacomp";usuarios[0][3] = "senha123";usuarios[0][4] = "fla@br";
        usuarios[1][0] = "eu";usuarios[1][1] = "0123";usuarios[1][2] = "eucomp";usuarios[1][3] = "senha123";usuarios[1][4] = "eu@br";
        int num_usuarios = 2;
        String opcao;
        JOptionPane.showMessageDialog(null, "BEM VINDO(A) AO SISTEMA!");
        while (true) {
            opcao = JOptionPane.showInputDialog(null,
                    "(1) LOGIN\n(2) INSCRIÇÃO\n(3) SAIR\nDIGITE:");
            if (opcao.equals("1")) {
                JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU FAZER LOGIN");
                String login = JOptionPane.showInputDialog(null, "Login:");
                String senha = JOptionPane.showInputDialog(null, "Senha:");
                boolean loginSucesso = false;
                for (int linha = 0; linha < num_usuarios; linha++) {
                    if (usuarios[linha][2] != null) {
                        if (usuarios[linha][2].equals(login) && usuarios[linha][3].equals(senha)) {
                            JOptionPane.showMessageDialog(null, "Acesso Permitido");
                            loginSucesso = true;
                            break;
                        }
                    }
                }
                if (loginSucesso) {
                    int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if (confirmacao == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "ATÉ LOGO!");
                        break;
                    }
                }

            } else if (opcao.equals("2")) {
                JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU FAZER UMA INSCRIÇÃO");
                usuarios[num_usuarios][0] = JOptionPane.showInputDialog(null, "NOME:");
                usuarios[num_usuarios][1] = JOptionPane.showInputDialog(null, "CPF:");
                usuarios[num_usuarios][2] = JOptionPane.showInputDialog(null, "LOGIN:");
                usuarios[num_usuarios][3] = JOptionPane.showInputDialog(null, "SENHA:");
                usuarios[num_usuarios][4] = JOptionPane.showInputDialog(null, "E-MAIL:");
                num_usuarios++;
                JOptionPane.showMessageDialog(null, "INSCRIÇÃO REALIZADA COM SUCESSO!\nRETORNE AO MENU PRINCIPAL...");
            } else if (opcao.equals("3")) {
                JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU SAIR. ATÉ LOGO!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
            }
        }
    }
}
