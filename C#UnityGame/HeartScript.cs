using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI; // biblioteka do obsslugi elemnetow UI

public class HeartScript : MonoBehaviour
{

    //public int health; // aktualne zycia jakie posiadamy
    //zamiast tego globalna ControlPanel.health
    public int numOfHearts; // wszystkie zycia
    

    public Image[] hearts; // tablica do przechowania wszystkich żyć
    public Sprite fullHeart; // dla pelnego 
    public Sprite emptyHeart; // dla pustego

    void Update()
    {

        for (int i = 0; i < hearts.Length; i++) { // dopoki i jest mniejsze od tablicy przechowujacej serca
            if (i < ControlPanel.health)
            {// jesli i jest mniejsze od liczby zyc
                hearts[i].sprite = fullHeart; // pelne
            }
            else {
                hearts[i].sprite = emptyHeart; // puste
            }
        }
    }
}

