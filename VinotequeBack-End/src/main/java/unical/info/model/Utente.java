package unical.info.model;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.List;


public class Utente{
    Long id;
    String nome;
    String cognome;
    Date data_di_nascita;
    String email;
    String password;
    String numero_telefono;
    String ruolo;



    long utente_indirizzo;
    List<Promozione> utilizzati;

    public Utente(Long id, String nome, String cognome, Date data_di_nascita, String email, String password, String numero_telefono, String ruolo, long utente_indirizzo) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.data_di_nascita = data_di_nascita;
        this.email = email;
        this.password = password;
        this.numero_telefono = numero_telefono;
        this.ruolo = ruolo;
        this.utente_indirizzo = utente_indirizzo;
    }

    public Utente() {    }


    public List<Promozione> getUtilizzati() {
        return utilizzati;
    }

    public void setUtilizzati(List<Promozione> utilizzati) {
        this.utilizzati = utilizzati;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getData_di_nascita() {
        return data_di_nascita;
    }

    public void setData_di_nascita(Date data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String encryptedPassword = BCrypt.hashpw(password,BCrypt.gensalt(12));
        this.password = encryptedPassword;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }


//indirizzo: prendere i vari campi(citta, cap, nazione, via) in textbox separate e poi concatenarli in un unico attributo
}