﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SalarioTotal
{
    internal class Salario
    {

        public string nome;
        public double fixo;
        public double vendas;

        public void ImprimirDados()
        {
            Console.WriteLine((this.vendas * 0.15) + this.fixo);
        }
    }
}