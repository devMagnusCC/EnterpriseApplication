# Enterprise Application
 
Sistema de gerenciamento de funcionários desenvolvido em Java, aplicando os conceitos de **Orientação a Objetos**: herança, encapsulamento e polimorfismo.
 
---
 
## Sobre o projeto
 
Este projeto simula um sistema de RH onde é possível cadastrar, listar e remover funcionários de uma empresa. Cada tipo de funcionário possui uma regra de cálculo de salário diferente, demonstrando o uso de polimorfismo na prática.
 
---
 
## Funcionalidades
 
- ✅ Cadastrar funcionário CLT
- ✅ Cadastrar funcionário PJ
- ✅ Listar todos os funcionários com salário calculado
- ✅ Remover funcionário por índice
- ✅ Calcular folha de pagamento total da empresa
- ✅ Menu interativo via terminal
 
---
 
## Conceitos aplicados
 
| Conceito | Onde foi aplicado |
|---|---|
| **Herança** | `EmployeeCLT` e `EmployeePJ` herdam de `Employee` |
| **Encapsulamento** | Atributos `private` com getters e setters |
| **Polimorfismo** | `calculateSalary()` sobrescrito em cada subclasse |
| **Interface** | `Salary` define o contrato de cálculo |
| **Enum** | `EmployeeType` para tipagem segura de funcionários |
| **ArrayList** | Lista dinâmica de funcionários na `Enterprise` |
 
---
 
## Estrutura do projeto
 
```
src/
├── Governance/
│   ├── Employee.java         ← classe abstrata base
│   ├── EmployeeCLT.java      ← funcionário com carteira assinada
│   ├── EmployeePJ.java       ← funcionário pessoa jurídica
│   ├── EmployeeType.java     ← enum com os tipos de funcionário
│   └── Salary.java           ← interface de cálculo de salário
├── Enterprise/
│   └── Enterprise.java       ← gerencia a lista de funcionários
└── Main.java                 ← menu interativo via Scanner
```
 
---
 
## Cálculo de salário
 
**CLT**
```
salário = salário base + (horas extras × valor da hora)
ex: 3000 + (12 × 14) = R$ 3.168,00
```
 
**PJ**
```
salário = salário base × (1 - taxa de imposto)
ex: 6464 × (1 - 0.15) = R$ 5.494,40
```
 
---
 
## Como rodar
 
**Pré-requisito:** Java 11 ou superior instalado.
 
```bash
# clone o repositório
git clone https://github.com/devMagnusCC/EnterpriseApplication
 
# entre na pasta
cd EnterpriseApplication
 
# compile
javac -d out src/**/*.java src/Main.java
 
# rode
java -cp out Main
```
 
Ou abra direto no **IntelliJ IDEA** e rode o `Main.java`.
 
---
 
## Exemplo de uso
 
```
ENTERPRISE NAME: TechCo
 
(1) SHOW ALL EMPLOYEES
(2) ADD EMPLOYEE
(3) REMOVE EMPLOYEE
(4) EXIT
CHOOSE OPTION: 2
 
(1)-CLT  (2)-PJ
CHOOSE ONE: 1
NAME: Ana Clara
CPF: 754.231.214-05
BASE SALARY: 3000
EXTRA HOURS: 12
EXTRA HOUR VALUE: 14
CLT EMPLOYEE ADDED!
 
(1) SHOW ALL EMPLOYEES
(2) ADD EMPLOYEE
(3) REMOVE EMPLOYEE
(4) EXIT
CHOOSE OPTION: 1
 
------ TechCo ------
--- CLT EMPLOYEE ---
Name: Ana Clara
CPF: 754.231.214-05
Base salary: R$ 3000,00
Extra hours: 12
Extra hour value: R$ 14,00
Total salary: R$ 3168,00
--------------------
TOTAL PAYROLL: R$ 3168,00
```
 
---
 
## Aprendizados
 
Este projeto foi desenvolvido durante meus estudos de **Java e Orientação a Objetos**, cobrindo:
 
- Classes abstratas e interfaces
- Herança e sobrescrita de métodos com `@Override`
- Encapsulamento com modificadores de acesso
- Polimorfismo com listas genéricas `List<Employee>`
- Enum para tipagem segura
- Entrada de dados com `Scanner`
- Organização de código em packages
 
---
 
## Autor
 
**devMagnusCC**  
[github.com/devMagnusCC](https://github.com/devMagnusCC
