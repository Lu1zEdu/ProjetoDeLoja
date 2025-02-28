import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "Storecat",
  description: "Um projeto de um ecommmer",
};

export const viewport = {
  width:"device-width",
  initial_scale:1.0,
  colorScheme:"dark"
}

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="pt-br">
      <body>
        {children}
      </body>
    </html>
  );
}
