public class SistemaBiblioteca {
    public static void main(String[] args) {
        System.out.println("Início");
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis"));
        biblioteca.adicionarLivro(new Livro("1984"));

        Usuario usuario = new Usuario("Tiago");

        biblioteca.emprestarLivro(usuario, new Livro("O Senhor dos Anéis"));

        System.out.println("Livros disponíveis:");
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro.getTitulo());
        }
    }
}
