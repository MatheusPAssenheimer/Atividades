﻿using SalarioTotal;
using System;
using System.Globalization;
namespace SalarioTotal
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Digite o nome:");
            Salario s = new Salario();
            s.nome = Console.ReadLine();
            Console.WriteLine("Digite o salário fixo:");
            s.fixo = double.Parse(Console.ReadLine());
            Console.WriteLine("Digite o total de vendas feitas");
            s.vendas = double.Parse(Console.ReadLine());
            Console.WriteLine("O Salário total é de:");

            s.ImprimirDados();


        }
    }
}