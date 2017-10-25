package com.estrutura.dados.domain;

public class Contato {

    private String email;

    private String nome;

    private String numeroTelefone;

    public Contato(final String pNome, final String pNumeroTelefone, final String pEmail) {

	nome = pNome;
	numeroTelefone = pNumeroTelefone;
	email = pEmail;
    }

    @Override public boolean equals(final Object pO) {
	if (this == pO) {
	    return true;
	}
	if (!(pO instanceof Contato)) {
	    return false;
	}

	final Contato contato = (Contato) pO;

	if (getEmail() != null ? !getEmail().equals(contato.getEmail()) : contato.getEmail() != null) {
	    return false;
	}
	if (getNome() != null ? !getNome().equals(contato.getNome()) : contato.getNome() != null) {
	    return false;
	}
	return getNumeroTelefone() != null ?
			getNumeroTelefone().equals(contato.getNumeroTelefone()) :
			contato.getNumeroTelefone() == null;
    }

    public String getEmail() {
	return email;
    }

    public String getNome() {
	return nome;
    }

    public String getNumeroTelefone() {
	return numeroTelefone;
    }

    public void setEmail(final String pEmail) {
	email = pEmail;
    }

    public void setNome(final String pNome) {
	nome = pNome;
    }

    public void setNumeroTelefone(final String pNumeroTelefone) {
	numeroTelefone = pNumeroTelefone;
    }

    @Override public String toString() {
	return "Contato{" +
			"nome='" + nome + '\'' +
			", numeroTelefone='" + numeroTelefone + '\'' +
			", email='" + email + '\'' +
			'}';
    }
}
