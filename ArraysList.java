package Class;
import java.util.Scanner;

public class ArraysList {
	public static void main(String[] args) { 	 
		Scanner sc = new Scanner(System.in);
	 	AddColor colors = new AddColor();
        int choice;
        
        do {
        	System.out.println("Menu Principal");
            System.out.println("1 - Adicionar cores | 2 - Iterar cores | 3 - Primeira posicao");
            System.out.println("4 - Buscar pelo id | 5 - Buscar pelo nome | 6 - Renomear cor");
            System.out.println("7 - Remover cor | 8 - Inserir em determinada posicao | 9 - Ordem alfabetica");   
            System.out.println("0 - Sair");
            System.out.print("Digite qual opcao deseja executar:  ");
        
            choice = sc.nextInt();
            
            if (choice == 0) {
                System.out.println("Programa encerrado.");
            }
            switch (choice) {
                case 1 -> colors.Colors();
                case 2 -> colors.Iteract();
                case 3 -> colors.InsertFirst();
                case 4 -> colors.SearchColorId();
                case 5 -> colors.SearchColorName();
                case 6 -> colors.RenameColor();
                case 7 -> colors.RemoveColor();
                case 8 -> colors.InsertAtPosition();
                case 9 -> colors.AlphabeticalSort();
            }
        } while (choice != 0);
        sc.close();
    }
}