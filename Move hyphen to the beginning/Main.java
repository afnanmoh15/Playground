def move (st):
  cha=[ch for ch in st if ch!="-"]
  hyp=[ch1 for ch1 in st if ch1=="-"]
  space= ""
  fi=space.join(cha)
  f2=space.join(hyp)
  return f2+fi
str=input()
ans=move(str)
print(ans)