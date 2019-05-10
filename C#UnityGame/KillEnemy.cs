using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class KillEnemy : MonoBehaviour
{
    public SpriteRenderer EnemySprite;//referencja do Przeciwnikia
    public GameObject Enemy;//referencja do Przeciwnikia

    public Collider2D EnemyKiller; // referencja do obiektu kolizujacego z przciwnikiem
    public Collider2D BloopColider; //colider boczny
    public Collider2D BloopColider2; // colider gorny
    public Collider2D BloopKillZone;//hitbox przeciwnika
    public Collider2D triggerKill;
    public Transform groundDetection;    


    public Animator animator;


    private void OnTriggerEnter2D(Collider2D col)
    {
        EnemyPatrol sc = gameObject.GetComponentInParent<EnemyPatrol>(); // komunikacja Parent Children
        sc.speed = 0;//jesli ginie zatrzymuje sie w miejscu

        if (col==EnemyKiller) { // jeslkolizja nastepuje z obiektem enemykiller
            Destroy(BloopColider); // niszczenie Colidera Bloopa
            Destroy(BloopColider2); // niszczenie Colidera Bloopa
            
            PlayerMovement.RbPlayer.GetComponent<Rigidbody2D>().velocity = new Vector2(0, 12);// odpychanie gracza po otrzymaniu obrazen

            animator.SetBool("isDeath", true); // animacja smierci bloopa
            Destroy(EnemySprite,0.85f); // niszczenie sprita
            Destroy(Enemy, 1.5f); // niszczenie calego obiektu enemy
            Destroy(triggerKill);//niszczenie trigera do zabijania 
            Destroy(BloopKillZone); // niszczenie hitboxa Bloopa
            SoundScript.PlaySound("sKill"); // dzwiek niszczenia opponenta

        }
    }
}
