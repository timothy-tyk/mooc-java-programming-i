
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        String result="";
        if(this.elements.size()==0){
            result+=String.format("The collection %s is empty.", this.name);
        }else if(this.elements.size()==1){
            result+=String.format("The collection %s has %s element.\n", this.name,this.elements.size());
            for(String element:this.elements){
                result+=element;
            }
        }else{
            result+=String.format("The collection %s has %s elements.\n", this.name,this.elements.size());
            for(int i=0;i<elements.size();i++){
                if(i==elements.size()-1){
                    result+=elements.get(i);
                }else{
                    result+=elements.get(i)+"\n";
                }
            }
        }
        return result;
    }
    
}
