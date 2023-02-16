package listademusicas;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.reverseOrder;
import java.util.List;
import javax.swing.JOptionPane;

public class ListaDeMusicas {
    public static void main(String[] args) {
      List<Musica> musicas = new ArrayList<>();
      int opcao;
      do{
          opcao=Integer.parseInt(JOptionPane.showInputDialog("0-Sair\n"
          + "1-Inserir\n2-Avaliar musica\n3-Ver lista de musicas ordenadas"));
          switch(opcao){
              case 1:
                  String musicaInserir =JOptionPane.showInputDialog("Qual"
                  + " o nome da musica?");
                  musicas.add(new Musica(musicaInserir));
                  JOptionPane.showMessageDialog(null,"Musica"
                          + " armazenado com sucesso");                     
                  break;
              case 2:
                  String musicaAvaliar =JOptionPane.showInputDialog("Qual"
                  + " musica deseja avaliar?");
                  int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual"
                          + "a nota?"));
                  for(int i=0;i<musicas.size();i++){
                      if(musicas.get(i).getTitulo().equals(musicaAvaliar)){
                          musicas.get(i).setAvaliacao(nota);
                          break;
                      }                  
                  }
                          
                  break;
              case 3:
                  Collections.sort(musicas,reverseOrder());
                  JOptionPane.showMessageDialog(null, musicas);
                  
                  break;
              case 0:
                  JOptionPane.showMessageDialog(null,"Até mais");
                  break;
              default:
                  JOptionPane.showMessageDialog(null,"Opcao invalida");
          
          }
          
          
      }while(opcao !=0);
      
    }
}
