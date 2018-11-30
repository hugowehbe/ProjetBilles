package son;

import java.io.*;
import javax.sound.sampled.*;

/*
 * esai de lecture d'un fichier son complet et envoi du son vers un haut-parleur
 *
 * */
public class GestionAudio implements Runnable
{
    public GestionAudio() {
        run();
    }

    public void run() {
        try {
//File fichier;
            FileInputStream f;
            File p�re, f1, ici, ici2;

            p�re = new File("");

//System.err.println("fichier = "+fichier.getAbsolutePath());

//f = new FileInputStream(fichier.getAbsoluteFile());

            ici = new File(p�re.getAbsoluteFile(), "src");

            ici2 = new File(ici.getAbsoluteFile(), "son");
/*
f1=new File(ici.getAbsoluteFile(),"IndochinePinkwater666.wav");
*/
            f1 = new File(ici2.getAbsoluteFile(), "son.wav");


            AudioInputStream audioInputStream;
            audioInputStream = AudioSystem.getAudioInputStream(f1);

            AudioFormat format = audioInputStream.getFormat();


/*
DataLine.Info info;

info = new DataLine.Info(SourceDataLine.class, format);
*/
            SourceDataLine ligne;

            ligne = AudioSystem.getSourceDataLine(format);


            ligne.open(format);


            int tailleFrame;

            tailleFrame = format.getFrameSize();

            int m;  // est le nombre de frames lus en une fois

            m = (int) (0.01 * format.getFrameRate()); //nombre de frames en 1/100�me  seconde (frameRate = fr�quence en Herz)

            int tailleTampon;

            tailleTampon = m * tailleFrame; //nombre d'octets lus en une fois dans la boucle

            byte[] tampon = new byte[tailleTampon]; // la taille du tampon doit �tre un multiple de la taille d'un frame
// correspond � une 1/100 de seconde de son


            ligne.start(); // d�tail � la con � ne pas oublier


            long l;
            l = audioInputStream.getFrameLength(); // taille du fichier audio exprim�e en nombre de frames

            long q, r;

// l = q*n + r  :  division euclidienne

            q = l / m; //nbre de passages � faire
            r = l % m; // nbre de frames qu'il restera � lire apr�s la boucle
            int reste; // nbre d'octets restant � lire apr�s la boucle

            reste = (int) (r * tailleFrame);
            long p;
            for (p = 0; p < q; ++p) {
                audioInputStream.read(tampon); // lit m frames sur le fichier audio
                ligne.write(tampon, 0, tampon.length); // �crit les m frames sur la ligne et donc les envoie sur un haut-parleur
            }

            audioInputStream.read(tampon, 0, reste); // lit les r  frames restant sur le fichier audio
            ligne.write(tampon, 0, reste); // �crit les r frames restant sur la ligne et donc les envoie sur un haut-parleur


        }//try
        catch (FileNotFoundException e) {
            System.err.println("le fichier son est introuvable : " + e);
        } catch (UnsupportedAudioFileException e) {
            System.err.println("le type de fichier son n'est pas reconnu : " + e);
        } catch (IOException e) {
            System.err.println("le fichier son ne peut pas �tre ouvert : " + e);
        } catch (LineUnavailableException e) {
            System.err.println("le type de ligne demand� n'est pas disponible sur le syst�me : " + e);
        } catch (SecurityException e) {
            System.err.println("on n'est pas autoris� � ouvrir la ligne : " + e);
        } catch (IllegalArgumentException e) {
            System.err.println("incompatibilit� entre les types de lignes disponibles par le syst�me et le format : " + e);
        } catch (IllegalStateException e) {
            System.err.println("la ligne est d�j� ouverte : " + e);
        }
    }

}