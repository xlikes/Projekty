using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CookieEat : MonoBehaviour
{
    public Animator animator;
    public Collider2D BOB;//colider BOBa


    void OnTriggerEnter2D(Collider2D col){
        if (ControlPanel.health < 4) // jesli zycie nie jest pelne
        {
            if (col == BOB) // jesli kolizja nastepuje z BOBem
            {
                ControlPanel.health++; // zycie wzrasta po zebraniu ciastka
            }
            Debug.Log(ControlPanel.health);
            animator.SetBool("CookieDestroy", true);
            Destroy(gameObject, this.GetComponent<Animator>().GetCurrentAnimatorStateInfo(0).length - 0.1f);//niszczenie ciastka
                                                                                                           //niszczenie ciastka z 0,8f to opoznienie


            SoundScript.PlaySound("sCookie"); // dzwiek dla zebrania zycia
        }

    }

}
