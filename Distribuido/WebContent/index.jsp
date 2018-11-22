<html>
<head><title>Página de Login</title></head>
	<body>
		<form action="Ola" method="get">
			<fieldset>
    <legend>Formulário</legend>
    Usuario: <input type="text" name="usuario" /><br /><br />
    Senha: <input type="password" name="senha" /><br /><br />
    Endereço: <input type="text" name="endereco" /><br /><br />
    Cidade: <input type="text" name="cidade" /><br /><br />
    Estado: <input type="text" name="estado" /><br /><br />
    Gênero: <input type="radio" name="genero" value="m" checked />Masculino
    <input type="radio" name="genero" value="f" />Feminino<br /><br />
    Idade: <select name = "idade">
      <option value="1">entre 1 a 10 anos</option>
      <option value="10">entre 10 a 20 anos</option>
      <option value="20">entre 20 a 30 anos</option>
      <option value="30">entre 30 a 40 anos</option>
      <option value="40">entre 40 a 50 anos</option>
      <option value="50">entre 50 a 60 anos</option>
      <option value="60">entre 60 a 70 anos</option>
      <option value="70">entre 70 a 80 anos</option>
      <option value="80">entre 80 a 90 anos</option>
      <option value="90">entre 90 a 100 anos</option>
    </select>
  </fieldset>
 
  <fieldset>
    <legend>Linguagens</legend>
    <input type="checkbox" name="linguagem" value="Java" />Java
    <input type="checkbox" name="linguagem2" value="C" />C/C++
    <input type="checkbox" name="linguagem3" value="C#" />C#
  </fieldset>
 
  <fieldset>
    <legend>Descrição</legend>
    <textarea rows="5" cols="30" name="comentarios"></textarea>
  </fieldset>
 
  <input type="hidden" name="secret" value="888" />
  <input type="submit" value="SEND" />
  <input type="reset" value="CLEAR" />
		</form>
	</body>
</html>