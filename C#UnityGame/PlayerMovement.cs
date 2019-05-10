using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerMovement : MonoBehaviour

{

    public float speed; // predkosc charactera
    private float moveInput; // sprawdza lewo prawo
    private bool facingRight = true;

    private bool isGrounded; // Sprawdza czy gracz dotyka podloza
    public Transform groundCheck;// transform dla obiektu sprawdzajacego
    public float checkRadius; // potrzebne cos
    public LayerMask whatIsGround;//Co jest podlozem

    private int extraJumps;//wartosc dla skoku
    public int extraJumpsValue;//wartosc dla podwojnego skoku
    public float jumpForce; // moc skoku

    public Animator animator;

    public static Rigidbody2D RbPlayer; // referencja do rigidbody

    void Start()
    {
        extraJumps = extraJumpsValue;
        RbPlayer = GetComponent<Rigidbody2D>();//Pobranie RigidBody od gracza
    }

    void FixedUpdate()
    {
        
        isGrounded = Physics2D.OverlapCircle(groundCheck.position, checkRadius, whatIsGround);
		//sprawdza warunki dla gracza stojacego na ziemi

        moveInput = Input.GetAxis("Horizontal"); // ustala lewo prawo "-1 a 1"
        RbPlayer.velocity = new Vector2(moveInput * speed, RbPlayer.velocity.y);//poruszenie gracza o dana predkosc

        if (facingRight == false && moveInput > 0) // jesli input = 1 i prawa falsz
        {
            Obrot();//obrot
        }
        else if (facingRight == true && moveInput < 0)//jesli input = -1 i prawa prawda
        {
            Obrot();
        }

    }

    void Update() {



        animator.SetFloat("Speed",Mathf.Abs(moveInput)); // wartosc bezwzgledna dla moveInput

        if (isGrounded == true)
        {//jesli jest na ziemi 
            animator.SetBool("isJump", false);
            extraJumps = extraJumpsValue;//mozemy ustawic ilosc skokow
        }
        if (isGrounded == false) {
            animator.SetBool("isJump", true);

            
        }


        if ((Input.GetKeyDown(KeyCode.UpArrow)|| Input.GetKeyDown("w")) && extraJumps == 0 && isGrounded == true)
        {
            SoundScript.PlaySound("sJump"); // dzwiek dla skoku
            RbPlayer.velocity = Vector2.up * jumpForce;//podskoczenie jumpForce
        }
        else if ((Input.GetKeyDown(KeyCode.UpArrow) || Input.GetKeyDown("w")) && extraJumps > 0)
        {
            RbPlayer.velocity = Vector2.up * jumpForce;//podskoczenie jumpForce
            extraJumps--;//aby skok nie byl nieskonczony
        }
    }

    void Obrot()
    { // Funkcja obracajaca Sprita o 180 w osi Y
        facingRight = !facingRight; // jesli facing right zmieni swoja wartosc 
        Vector3 Scaler = transform.localScale;
        Scaler.x *= -1; // zmieniamy os x na odwrotna
        transform.localScale = Scaler; // przypisanie nowej orientacji lewo prawo
    }




}


