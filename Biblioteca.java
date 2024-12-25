import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (livros.contains(livro)) {
            emprestimos.add(new Emprestimo(usuario, livro));
            livros.remove(livro);
            System.out.println("Livro emprestado: " + livro.getTitulo() + " para " + usuario.getNome());
        } else {
            System.out.println("Livro não disponível: " + livro.getTitulo());
        }
    }

    public void devolverLivro(Livro livro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro)) {
                emprestimos.remove(emprestimo);
                livros.add(livro);
                System.out.println("Livro devolvido: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado nos empréstimos: " + livro.getTitulo());
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
