import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;


    public Emprestimo(Usuario usuario, Livro livro){
        this.usuario = usuario;
        this.livro =  livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
