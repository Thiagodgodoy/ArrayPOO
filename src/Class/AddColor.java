package Class;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AddColor {	
	
    ArrayList<String>colorList = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);   
    private int quantity;
    private int colorID;
    private int index;
    private String colorName;
    private String colorTitle;
    private String elements;
    private String colorRename;
    
    public void Colors() {
    	System.out.print("Digite quantas cores deseja adicionar: ");
        this.setQuantity(sc.nextInt());
        for (int i = 0; i < this.getQuantity(); i++) {
        	System.out.print("Digite a cor que deseja adicionar: ");
            this.setColorName(sc.next());
            colorList.add(this.getColorName());
        }   System.out.println(this.getColorList());
    }
    
    public void Iteract() {
    	for (int i = 0; i < this.getColorList().size(); i++) {
    		this.setColorName(this.getColorList().get(i)); 
    		System.out.println(this.getColorName());
        }
    }
    
    public void InsertFirst(){
        System.out.print("Digite a cor que deseja adicionar: ");
        this.setColorName(sc.next());
        this.getColorList().add(0, this.getColorName());
        System.out.println(this.getColorList());
    }
    
    public void SearchColorId(){
        System.out.print("Digite qual posição você deseja mostrar: ");        
        this.setColorID(sc.nextInt());        
        this.setElements(this.getColorList().get(this.getColorID()));
        System.out.println(this.getElements());
    }
    
    public void SearchColorName(){
    	System.out.println(this.getColorList());
        System.out.print("Digite qual cor você deseja mostrar: ");
        this.setColorTitle(sc.next());
        this.setIndex(this.index = 0);        
        for (int i = 0; i < this.getColorList().size(); i++) {
        	if(this.getColorList().get(i).equals(this.getColorTitle())) {
        		this.setIndex(i);
        		System.out.println(this.getIndex());
        	}        	
        } 
    }
    
    public void RenameColor(){
    	System.out.print("Digite qual gostaria de alterar: ");
        this.setColorID(sc.nextInt());
        System.out.print("Qual cor gostaria de inserir: ");
        this.setColorRename(sc.next());
        this.setElements(this.getColorList().set(this.getColorID(), this.getColorRename()));
        System.out.println(this.getColorList());        
    }
    
    public void RemoveColor(){
        System.out.println("Digite qual o id da cor que deseja remover: ");
        this.setColorID(sc.nextInt());
        this.getColorList().remove(this.getColorID());
        System.out.println(this.getColorList());
    }
    
    public void InsertAtPosition(){
        System.out.print("Digite a cor que deseja adicionar: ");
        this.setColorName(sc.next());
        System.out.print("Digite o id que deseja adicionar: ");
        this.setIndex(sc.nextInt());
        this.getColorList().add(this.getIndex(), this.getColorName());
        System.out.println(this.getColorList());
    }
    
    public void AlphabeticalSort(){
        Collections.sort(this.getColorList());
        System.out.println(this.getColorList());
    }
    
	public ArrayList<String> getColorList() {
		return colorList;
	}
	
	public void setColorList(ArrayList<String> colorList) {
		this.colorList = colorList;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getColorID() {
		return colorID;
	}
	
	public void setColorID(int colorID) {
		this.colorID = colorID;
	}
	
	public String getColorName() {
		return colorName;
	}
	
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	
	public String getColorTitle() {
		return colorTitle;
	}
	
	public void setColorTitle(String colorTitle) {
		this.colorTitle = colorTitle;
	}
	
	public String getElements() {
		return elements;
	}
	
	public void setElements(String elements) {
		this.elements = elements;
	}
	
	public String getColorRename() {
		return colorRename;
	}
	
	public void setColorRename(String colorRename) {
		this.colorRename = colorRename;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}	
}