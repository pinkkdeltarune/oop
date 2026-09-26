/*
Scrivi un programma in Java che legga un numero intero positivo di 4 cifre inserito dall'utente (es. 4382) e verifichi se è valido come di seguito descritto:
Estrai le 4 singole cifre dal numero intero inserito.
Calcola la somma pesata:
Moltiplica la 1ª e la 3ª cifra per 3.
Moltiplica la 2ª e la 4ª cifra per 1.
Somma i risultati ottenuti per ottenere il codice di controllo.

Il codice è valido se è un multiplo di 10.
Altrimenti, il codice non è valido.

Esempi di test:
4382 -> Codice non Valido
3131 -> Codice valido
 */
package esercizi;

@SuppressWarnings("empty-statement")
public class AlgoritmoDiLuhnSemplificato {
    public static void main(){
     int num;
     do{
         System.out.println("inserisci un numero a 4 cifre: ");
            num=Tastiera.leggiUnIntero();
     } while(num<1000 || num>9999 );
     int temp=num;
     int uno= (temp/1000);
     int due= (temp/100)%10;
     int tre= (temp/10)%10;
     int quattro= (temp%10);
     
     
     uno=uno*3;
     tre=tre*3;
     int codiceControllo= (uno+due+tre+quattro);
     System.out.println("il codice di controllo e: " + codiceControllo);
     if (codiceControllo %10 ==0){
         System.out.println("il codice e valido|!");
     }
     else{
         System.out.println("il codice non e valido");
     }
     
     
     
}
}