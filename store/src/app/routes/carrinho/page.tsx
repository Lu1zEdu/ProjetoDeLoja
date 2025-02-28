import Cart from '@/Components/Cart/cart'
import React from 'react'
import Headers from '../../../Components/Headers/Headers';

export default function Carrinho() {
  return (
    <div>
        <Headers/>
        <br />
        <h1>Carrinho : </h1>
        <br />
        <Cart />
    </div>
  )
}
