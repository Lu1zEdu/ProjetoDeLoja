import Link from 'next/link'
import React from 'react'

export default function login() {
  return (
    <div className='login'>  
        <nav className='Seta'>
          <ul>
            <Link href="/">←</Link>
          </ul>
        </nav>
        <h1>Login</h1>
        <form action="">          
          <div>
            <label htmlFor="">Email</label>
            <input type="email" placeholder='Email' />
          </div>
          <div>
            <label htmlFor="">Senha</label>
            <input type="password" placeholder='Senha' />
          </div>
          <button>Enviar</button>
        </form>
        <nav className='Cadastro'>
          <ul>
            <li>
              <Link href='/routes/cadastro'>Faça o seu Cadastro</Link>
            </li>
          </ul>
        </nav>
    </div>
  )
}
