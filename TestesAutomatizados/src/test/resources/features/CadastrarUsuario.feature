#language: pt
#enconding: UTF-8

@CadastrarUsuario
Funcionalidade: Cadastrar usuario
	@cadastro
	Cenario: cadastrar usuario
		Quando eu acionar aba admin
		Quando acionar o botao add
		Quando informar o campo employer name "Alice Duval"
		Quando informar o campo username "Lunaaaa"
		Quando informar o campo password "usuario123"
		Quando informar o campo confirm password "usuario123"
		E acionar o botao salvar
		Entao o sistema cadastra o usuario "Lunaaaa"
		