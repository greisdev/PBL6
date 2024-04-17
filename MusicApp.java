import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Media media = null;

        do {
            System.out.println("\n1. Cria usuario\n2. Cria Playlist\n3. Adiciona Musica\n0. Finaliza Programa");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nome de usuario: ");
                    String userName = scanner.next();
                    System.out.print("Email do usuario: ");
                    String userEmail = scanner.next();
                    media = new User(userName, userEmail);
                    System.out.println("Usuario criado: " + media.getName());
                    break;
                case 2:
                    System.out.print("Nome da playlist: ");
                    String playlistName = scanner.next();
                    media = new Playlist(playlistName);
                    System.out.println("Playlist criada: " + media.getName());
                    break;
                case 3:
                    if (media instanceof Playlist) {
                        System.out.println("Nome da musica: ");
                        String songName = scanner.next();
                        ((Playlist) media).addSong(songName);
                        ((Playlist) media).printSongs();
                    } else {
                        System.out.println("Crie uma playlist primeiro.");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Escolha invalida, escolha novamente");
            }
        } while (choice != 0);

        scanner.close();
    }
}
