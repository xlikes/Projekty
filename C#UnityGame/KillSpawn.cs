using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class KillSpawn : MonoBehaviour
{
    [SerializeField] Transform SpawnPoint; // pole do przeciagniecia w inspektorze do Punktu Spawnu
    [SerializeField] Transform player; //pole do przeciagniecia w inspektorze do Transformu Gracza


    private void Update()
    {
        CheckHealth();
    }

    void CheckHealth() {
        if (ControlPanel.health==0) { // jesli zycie rowne 0
            Debug.Log("Ała");
            ControlPanel.health = 3; // wypelniamy zycia na nowo
            player.transform.position = SpawnPoint.transform.position; // przypisujemy transformowi gracza pozycje transformu spawnPointu
        }
    }

}