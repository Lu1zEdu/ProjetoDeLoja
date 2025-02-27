import type { Config } from "tailwindcss";

const config: Config = {
  content: [
    "./src/pages/**/*.{js,ts,jsx,tsx,mdx}",
    "./src/components/**/*.{js,ts,jsx,tsx,mdx}",
    "./src/app/**/*.{js,ts,jsx,tsx,mdx}",
  ],
  theme: {
    
    extend: {
      colors: {
        background: "var(--background)",
        foreground: "var(--foreground)",
      },
      keyframes: {
        direita: {
          '-1%': { transform: 'translatex(145%)' },
          '50%': { transform: 'translatex(-20px)' },
          '100%': { transform: 'translatex(0)' },
        },
      },
      animation: {
        direcao: 'direita 1s ease-out forwards',
      },
      
    },
  },
  plugins: [],
};
export default config;
