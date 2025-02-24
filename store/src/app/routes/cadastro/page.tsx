import Link from 'next/link'
import React from 'react'

export default function Cadastro() {
  return (
    <div className='login'>
        <nav className='Seta'>
          <ul>
            <Link href="/">←</Link>
          </ul>
        </nav>
        <h1>Cadastro</h1>
        <form action="">
          <div>
            <label htmlFor="">Nome</label>
            <input type="text" placeholder='Primeiro Nome' />
          </div>
          <div>
            <label htmlFor="">Segundo Nome</label>
            <input type="text" placeholder='Segundo Nome' />
          </div>
          <div>
            <label htmlFor="">Email</label>
            <input type="email" placeholder='Email' />
          </div>
          <div>
            <label htmlFor="">Data de Nascimento</label>
            <input type="Date" />
          </div>
          <div>
            <label htmlFor="">Cpf</label>
            <input type='text' placeholder='CPF'/>
          </div>
          <div>
            <label htmlFor="">Senha</label>
            <input type='password' placeholder='Senha' />
          </div>
          <button>Enviar</button>
        </form>
        <nav className='Cadastro'>
          <ul>
            <li>
              <Link href='/routes/login'>Faça o seu Login</Link>
            </li>
          </ul>
        </nav>
    </div>
  )
}
