using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI; // biblioteka do używania elementów UI

public class ScoreScript : MonoBehaviour
{
    public Text score; // referencja do pola tekstowego

    public Animator animator; // referencja do animatora
    public Collider2D BOB;


    void OnTriggerEnter2D(Collider2D col) { // Triger ustawic w COINIE

        if (col == BOB)
        {
            ControlPanel.scoreValue++; // odwolanie do globalnej zmiennej 
            score.text = "ScOrE " + ControlPanel.scoreValue.ToString(); // referencja pole tekstowe ma wynosic tyle co zmienna

            animator.SetBool("CoinPickUp", true); // animacja zebrania coina jesli w animatorze Bollean CoinPickup == true
                                                  // Destroy(gameObject);// zniszczenie obiektu COINA Ponizej to samo lecz z animacja zakonczajaca "Destroy z opoznieniem"
            Destroy(gameObject, this.GetComponent<Animator>().GetCurrentAnimatorStateInfo(0).length - 0.75f); // 0,75f to opoznienie


            SoundScript.PlaySound("sCoin"); // dzwiek dla zebrania coina
        }
        }

}
