import sqlite3
import pandas as pd
from tkinter import*

con = sqlite3.connect('db/bestway.db')

def exportar():
    print('Gerar')
    var = int(str(txt.get()))    
    data = pd.read_sql_query("select * from alunos", con)
    dados = data[data['id_curso'] == var]
    print(data[data['id_curso'] == var])
    dados.to_excel('C:/Users/Usuário/Documents/'f'{var}'f'.xls')
    print('Gerado com sucesso.')
    lbl2 = Label(root, text = " Gerado com sucesso.")
    lbl2.place(x = 10, y = 160)
    
root = Tk()
root.title("Gerador")

lbl = Label(root, text = "ID do curso: ")
lbl.place(x = 10, y = 30)

txt = Entry(root)
txt.place(x = 10, y = 70)

bt = Button(root, text = "Exportar", command = exportar)
bt.place(x = 10, y = 120)

root.mainloop()








