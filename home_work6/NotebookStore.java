package home_work6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class NotebookStore {
    Set<Notebook> notebooksOnStock;

    public NotebookStore() {
        notebooksOnStock = new HashSet<>();
    }

    public NotebookStore(Notebook[] notebooks) {
        notebooksOnStock = new HashSet<>(Arrays.asList(notebooks));
    }
    public Set<Notebook> findByOptions(Notebook protoNote){

        return notebooksOnStock;
    }
    private Notebook createRequest(){
        int ram;
        int hdVolume;
        String os;
        String color;
        int option = 0;
        while(option != 5) {
            System.out.println("   “Введите цифру, соответствующую необходимому критерию:  \n" +
                    "   1 - ОЗУ  \n" +
                    "   2 - Объем ЖД  \n" +
                    "   3 - Операционная система  \n" +
                    "   4 - Цвет  \n" +
                    "   5 - Поиск");
        }

        return new Notebook("","", null, 0, 0, "", "");
    }

}