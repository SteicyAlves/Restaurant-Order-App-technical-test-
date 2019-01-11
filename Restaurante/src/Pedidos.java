/*
 * Este projeto foi desenvolvido por: Steicy Alves do Nascimento
 * Finalizado no dia: 11/01/2019
 * Teste T�cnico
 * */

import java.io.*;
public class Pedidos {

	public static void main (String args[]) {
		
		String periodo;
		String escolha = "escolhendo"; //Vari�vel que define se o usu�rio ainda est� escolhendo pratos.
		String comida; 
		int pratos; //Entrada dos n�meros de acordo com o prato.
		int p = 0, a = 0, b = 0, s = 0; //Os tipos de prato, respectivamente: principal, acompanhamento, bebida, sobremesa
		BufferedReader d; //Vari�vel de dados digitados pelo teclado.
		
		try {
			System.out.println("Ol�!");
			System.out.println("Digite morning se o periodo do dia for manh� ou night se o periodo do dia for noite e aperte ENTER.");
			d = new BufferedReader(new InputStreamReader(System.in));
			periodo = d.readLine();
			periodo = periodo.toLowerCase();
			
			if(periodo.equals("morning")) {
				
				System.out.println("\nO card�pio da manh� �: ");
				System.out.println("1- Prato Principal: Eggs");
				System.out.println("2- Acompanhamento: Toast");
				System.out.println("3- Bebida: Coffee"); //Pode pedir mais de um
				System.out.println("Observa��o: Apenas a bebida pode ser pedida por mais de uma vez.");
				System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
				System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
				
				while(escolha.equals("escolhendo")){
				 
					try {
						d = new BufferedReader(new InputStreamReader(System.in));
						comida = d.readLine();
						
						if(comida.equals("L") && p == 0 && a == 0 && b == 0
								|| comida.equals("l") && p == 0 && a == 0 && b == 0) {
							System.out.println("Fa�a pelo menos uma escolha.");
							
						}else if(comida.equals("L") || comida.equals("l") && comida.trim().length() == 0) {
							System.out.println("Entrada inv�lida. Digito vazio.");
							System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
							System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
							
						}else if(comida.equals("L") || comida.equals("l")) {
							escolha = "pronto";
						}else {
							pratos = Integer.parseInt(comida);
							
							if(pratos == 1 || pratos == 2 || pratos == 3) {
								
								if(pratos == 1 ) {
									
									p = p+1;
									System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
									System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
								}
									
								if(pratos == 2 ) {
									
									a = a+1;
									System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
									System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
								}
								
								if(pratos == 3) {
									
									b = b+1;
									System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
									System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
									
								}
								
								
							}else {
							
								System.out.println("Entrada inv�lida. O n�mero " + pratos +" n�o faz parte do card�pio. Digite apenas os n�meros do card�pio.");
								System.out.println("\nO card�pio da manh� �: ");
								System.out.println("1- Prato Principal: Eggs");
								System.out.println("2- Acompanhamento: Toast");
								System.out.println("3- Bebida: Coffee");//Pode pedir mais de um
								System.out.println("Observa��o: Apenas a bebida pode ser pedida por mais de uma vez.");
								System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
								System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
								
						  }	
						}
					}catch (Exception e) {
						//e.printStackTrace();
						System.out.println("Entrada inv�lida. Digite apenas os n�meros do card�pio ou L para parar de escolher.");
					}
				}
				System.out.println("\nOs pratos escolhidos foram: ");
				
				if(p != 0 && p > 1) {
					System.out.println("Eggs");
					System.out.println("Erro. N�o � permitido pedir mais de um prato principal.");
				} else if(p == 1) {
					System.out.println("Eggs");
					
					if(a != 0 && a > 1) {
						System.out.println("Toast");
						System.out.println("Erro. N�o � permitido pedir mais de um acompanhamento.");
					} else if(a == 1) {
						System.out.println("Toast");
						
						if(b != 0 && b != 1) {
							System.out.println("Coffe(x" + b + ")");
						}else if(b == 1) {
							System.out.println("Coffe");
						}
					} else if (a == 0) {
						if(b != 0 && b != 1) {
							System.out.println("Coffe(x" + b + ")");
						}else if(b == 1) {
							System.out.println("Coffe");
						}
					}
				} else if (p == 0) {
					if(a != 0 && a > 1) {
						System.out.println("Toast");
						System.out.println("Erro. N�o � permitido pedir mais de um acompanhamento.");
					} else if(a == 1) {
						System.out.println("Toast");
						
						if(b != 0 && b != 1) {
							System.out.println("Coffe(x" + b + ")");
						}else if(b == 1) {
							System.out.println("Coffe");
						}
					} else if (a == 0) {
						if(b != 0 && b != 1) {
							System.out.println("Coffe(x" + b + ")");
						}else if(b == 1) {
							System.out.println("Coffe");
						}
					}
				}
				
			}else if(periodo.equals("night")){
	
				System.out.println("\nO card�pio da noite �:");
				System.out.println("1- Prato Principal: Steak");
				System.out.println("2- Acompanhamento: Potato");//Pode pedir mais de uma
				System.out.println("3- Bebida: Wine");
				System.out.println("4- Sobremesa: Cake");
				System.out.println("Observa��o: Apenas o acompanhamento pode ser pedido por mais de uma vez.");
				System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
				System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
				
				while(escolha.equals("escolhendo")){
				 
					try {
						d = new BufferedReader(new InputStreamReader(System.in));
						comida = d.readLine();
						
						if(comida.equals("L") && p == 0 && a == 0 && b == 0 && s == 0
								|| comida.equals("l") && p == 0 && a == 0 && b == 0 && s == 0) {
							System.out.println("Fa�a pelo menos uma escolha.");
							
						}else if(comida.equals("L") || comida.equals("l") && comida.trim().length() == 0) {
							System.out.println("Entrada inv�lida. Digito vazio.");
							System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
							System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
							
						}else if(comida.equals("L") || comida.equals("l")) {
							escolha = "pronto";
						}else {
							pratos = Integer.parseInt(comida);
							
							if(pratos == 1 || pratos == 2 || pratos == 3 || pratos == 4) {
								
								if(pratos == 1 ) {
									
									p = p+1;
									System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
									System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
								}
									
								if(pratos == 2 ) {
									
									a = a+1;
									System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
									System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
								}
								
								if(pratos == 3) {
									
									b = b+1;
									System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
									System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
									
								}
								
								if(pratos == 4) {
									
									s = s+1;
									System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
									System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
									
								}
								
								
							}else {
								System.out.println("Entrada inv�lida. O n�mero " + pratos +" n�o faz parte do card�pio. Digite apenas os n�meros do card�pio.");
								System.out.println("\nO card�pio da noite �:");
								System.out.println("1- Prato Principal: Steak");
								System.out.println("2- Acompanhamento: Potato");//Pode pedir mais de uma
								System.out.println("3- Bebida: Wine");
								System.out.println("4- Sobremesa: Cake");
								System.out.println("Observa��o: Apenas o acompanhamento pode ser pedido por mais de uma vez.");
								System.out.println("\nDigite o n�mero correspondente ao prato que deseja e aperte ENTER para escolher o pr�ximo prato.");
								System.out.println("Quando acabar de escolher digite L e aperte ENTER.");
								
						  }	
						}
					}catch (Exception e) {
						//e.printStackTrace();
						System.out.println("Entrada inv�lida. Digite apenas os n�meros do card�pio ou L para parar de escolher.");
					}
				}
				System.out.println("\nOs pratos escolhidos foram: ");
				
				if(p != 0 && p > 1) {
					System.out.println("Steak");
					System.out.println("Erro. N�o � permitido pedir mais de um prato principal.");
				} else if(p == 1) {
					System.out.println("Steak");
					
					if(a != 0 && a != 1) {
							System.out.println("Potato(x" + a + ")");
							
							if(b != 0 && b > 1) {
								System.out.println("Wine");
								System.out.println("Erro. N�o � permitido pedir mais de uma bebida.");
							
							}else if(b == 1) {
								System.out.println("Wine");
								
								if(s != 0 && s > 1) {
									System.out.println("Cake");
									System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
								
								}else if(s == 1) {
									System.out.println("Cake");
									
								}
							}else if(b == 0) {
								if(s != 0 && s > 1) {
									System.out.println("Cake");
									System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
								
								}else if(s == 1) {
									System.out.println("Cake");
									
								}
							}
						}else if(a == 1) {
							System.out.println("Potato");
							
							if(b != 0 && b > 1) {
								System.out.println("Wine");
								System.out.println("Erro. N�o � permitido pedir mais de uma bebida.");
							
							}else if(b == 1) {
								System.out.println("Wine");
								if(s != 0 && s > 1) {
									System.out.println("Cake");
									System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
								
								}else if(s == 1) {
									System.out.println("Cake");
									
								}
							}else if(b == 0) {
								if(s != 0 && s > 1) {
									System.out.println("Cake");
									System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
								
								}else if(s == 1) {
									System.out.println("Cake");
									
								}
							}
						} else if (a == 0) {
							
							
							if(b != 0 && b > 1) {
								System.out.println("Wine");
								System.out.println("Erro. N�o � permitido pedir mais de uma bebida.");
							
							}else if(b == 1) {
								System.out.println("Wine");
								if(s != 0 && s > 1) {
									System.out.println("Cake");
									System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
								
								}else if(s == 1) {
									System.out.println("Cake");
									
								}
							}else if(b == 0) {
								if(s != 0 && s > 1) {
									System.out.println("Cake");
									System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
								
								}else if(s == 1) {
									System.out.println("Cake");
									
								}
							}
							
						}  
				} else if (p == 0) {
					if(a != 0 && a != 1) {
						System.out.println("Potato(x" + a + ")");
						
						if(b != 0 && b > 1) {
							System.out.println("Wine");
							System.out.println("Erro. N�o � permitido pedir mais de uma bebida.");
						
						}else if(b == 1) {
							System.out.println("Wine");
							
							if(s != 0 && s > 1) {
								System.out.println("Cake");
								System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
							
							}else if(s == 1) {
								System.out.println("Cake");
								
							}
						}else if(b == 0) {
							if(s != 0 && s > 1) {
								System.out.println("Cake");
								System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
							
							}else if(s == 1) {
								System.out.println("Cake");
								
							}
						}
					}else if(a == 1) {
						System.out.println("Potato");
						
						if(b != 0 && b > 1) {
							System.out.println("Wine");
							System.out.println("Erro. N�o � permitido pedir mais de uma bebida.");
						
						}else if(b == 1) {
							System.out.println("Wine");
							if(s != 0 && s > 1) {
								System.out.println("Cake");
								System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
							
							}else if(s == 1) {
								System.out.println("Cake");
								
							}
						}else if(b == 0) {
							if(s != 0 && s > 1) {
								System.out.println("Cake");
								System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
							
							}else if(s == 1) {
								System.out.println("Cake");
								
							}
						}
					} else if (a == 0) {
						
						
						if(b != 0 && b > 1) {
							System.out.println("Wine");
							System.out.println("Erro. N�o � permitido pedir mais de uma bebida.");
						
						}else if(b == 1) {
							System.out.println("Wine");
							if(s != 0 && s > 1) {
								System.out.println("Cake");
								System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
							
							}else if(s == 1) {
								System.out.println("Cake");
								
							}
						}else if(b == 0) {
							if(s != 0 && s > 1) {
								System.out.println("Cake");
								System.out.println("Erro. N�o � permitido pedir mais de uma sobremesa.");
							
							}else if(s == 1) {
								System.out.println("Cake");
								
							}
						}
						
					}  
				}
				
		
			}else {
				System.out.println("Entrada inv�lida. O per�odo do dia especificado n�o corresponde � nenhuma das op��es sugeridas.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
