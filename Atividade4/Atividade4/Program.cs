﻿using System;
using System.ComponentModel;
using System.Globalization;
namespace Atividade4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Triangulo t = new Triangulo();
            Console.WriteLine("Digite os números do para o lado A do triângulo:");
            t.A = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.WriteLine("Digite os números do para o lado B do triângulo:");
            t.B = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            Console.WriteLine("Digite os números do para o lado C do triângulo:");
            t.C = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
            double p1 = Math.Pow(t.A, 2);
            double p2 = Math.Pow(t.B, 2);
            double p3 = Math.Pow(t.C, 2);

            if (t.A <= 0 || t.B <= 0 || t.C <= 0)
            {
                Console.WriteLine("Digite um número maior que 0:");
            }

            else
            {

                if (t.A >= t.B + t.C)

                {
                    Console.WriteLine("Não forma triângulo");
                }

                else if (p1 == p2 + p3)
                {
                    Console.WriteLine("Triangulo retangulo");
                }

                else if (p1 > p2 + p3)
                {
                    Console.WriteLine("Triangulo obtusangulo");
                }
                else if (p1 < p2 + p3)

                {
                    Console.WriteLine("Triangulo Acutangulo");
                }

                else if (p1 == p2 && p2 == p3 && p1 == p3)
                {
                    Console.WriteLine("Triangulo Equilátero");
                }
                else if (p1 == p2 || p1 == p2 || p3 == p2)
                {
                    Console.WriteLine("Triangulo Isosceles");
                }













            }






        }
    }
}