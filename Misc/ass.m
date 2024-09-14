clc
clear all
syms x real
f = xcos(X) - xsin(x);
fx=diff(f,x);
c=solve(fx);
cmin= min(double(c));
cmax=max(double(c));
ezplot(f,[cmin-2,cmax+2])
hold on
fxx=diff(fx,x);
for i = 1:1:size(c)
    T1=subs(fxx,x,c(i));
    T3=subs(f,x,c(i));
  if (double (T1)==0)
      Sprintf('The point x is %d inflexion point',double(c(i)))
  else
      if(double(T1)<0)
          sprintf('The maximum point is %d',double(c(i)))
          sprintf('The value of hte function is %d', double(T3))
      else
          sprintf("maximum point x is %d",double(c(i)))
          sprintf("value of function is %d",double(T3))
      end
  end
      plot(double(c(i)),double(T3),'g*','MarkerSize',15);
end
pause
h=ezplot(fx,[cmin-2,cmax+2])
set(h,'color','r')
hold on
pause

e=ezplot(fxx,[cmin-4,cmax+4])
set(e,'color','g')
hold off
