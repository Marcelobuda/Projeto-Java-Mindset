package ProjetoJava;

public class cadastroPessoa {
		//declaração dos atributos da classe
		private String nomePessoa;
		private String sobrenomePessoa;
		private int dataNasc;
		private String sexo;
		String senha;
		
		//declaração dos metódos construtor
		public cadastroPessoa(String nomePessoa, String sobrenomePessoa, int dataNasc, String sexo,String senha) {
			
			this.nomePessoa = nomePessoa;
			this.sobrenomePessoa = sobrenomePessoa;
			this.dataNasc = dataNasc;
			this.sexo = sexo;
			this.senha = senha;
		//declaração dos demais metodos get e set		
		}

		public cadastroPessoa() {
			
		}

		public String getNomePessoa() {
			return nomePessoa;
		}

		public void setNomePessoa(String nomePessoa) {
			this.nomePessoa = nomePessoa;
		}

		public String getSobrenomePessoa() {
			return sobrenomePessoa;
		}

		public void setSobrenomePessoa(String sobrenomePessoa) {
			this.sobrenomePessoa = sobrenomePessoa;
		}

		public int getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(int dataNasc) {
			this.dataNasc = dataNasc;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public void imprimirInfo() {	
			System.out.println("\nNome: "+nomePessoa+"\nSobrenome: "+sobrenomePessoa+"\nIdade: "+dataNasc+"\nSexo: "+sexo+"\nSenha: "+senha);
			
			
		
		}

		public void getSenha() {
			return;
			
		}

		public void setSenha(String senha) {
			this.senha = senha;
			
		}

		
		}



