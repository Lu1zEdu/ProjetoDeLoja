import React from 'react'
export default function Produto({params}:{params:{id:number}}) {
  return (
    <div>
        <h1>Produto Encontrado</h1>
        <h2>Produto {params.id}</h2>
    </div>
  )
}
