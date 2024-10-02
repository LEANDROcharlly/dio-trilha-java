package List.OperacoesBasicas;

import java.util.list;

public class ListaTarefa{
    //atributo
    private list<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefas(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listataTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");

        System.out.println("O número total de elementos na lista é: " + listataTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefas("tarefa 1");

        System.out.println("O número total de elementos na lista é: " + listataTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }   
}