import { NextResponse } from "next/server";
import { promises as fs } from "fs";
import { TipoProdutos } from "@/types";

export async function GET() {

    const file = await fs.readFile(process.cwd() + "/src/DataBase/Produtos/base.json" , "utf-8");

    //PARSEAR O ARQUIVO
    const produtos = JSON.parse(file);
    return NextResponse.json(produtos);
}