using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class EnemyPatrol : MonoBehaviour
{

    public float speed=0.9f; // predkosc enemy
    public float distance;//dystans na jakiej chodzi przeciwnik
    private bool moveRight = true;

    public Animator animator;
    public Transform groundDetection; //Sprawdzacz jak daleko ma isc




    void Update()
    {
        if (speed > 0) {
            animator.SetBool("isRight", true);// jesli predkosc jest wieksza od 0 start animacji ruchu
        }

        transform.Translate(Vector2.right * speed * Time.deltaTime);
        //Poruszanie enemiego o pewna predkosc

        RaycastHit2D groundInfo = Physics2D.Raycast(groundDetection.position,Vector2.down,distance); // sprawdzanie czy jest podloze
        //Początek,Kierunek,Dystans

        if (groundInfo.collider == false||groundInfo.collider.tag=="endMove") // jesli koniec podloza lub blok z tagiem endMove
        {
            animator.SetBool("isRight", true);//ustawienie animacji na ruch w prawo
            if (moveRight == true)
            {
                transform.eulerAngles = new Vector3(0, -180, 0); // obrot o 180 stopni
                moveRight = false; // zmiana kierunki
            }else
            {
                transform.eulerAngles = new Vector3(0, 0, 0); // obrot o 180 stopni
                moveRight = true; // zmiana kierunku

            }
        }
    }



    }
