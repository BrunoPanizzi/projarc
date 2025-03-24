import java.util.List;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

public class LogSimplesSingleton implements Iterable<String>{
    static private LogSimplesSingleton instance;
    private List<String> mensagens;

    private LogSimplesSingleton() {
        mensagens = new LinkedList<>();
    }
    
    synchronized public static LogSimplesSingleton getInstance() {
        if (instance == null) {
            instance = new LogSimplesSingleton();
        }
        return instance;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
