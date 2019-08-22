''' Read input from STDIN. Print your output to STDOUT '''
#Use input() to read input from STDIN and use print to write your output to STDOUT
import sys
def main():
    x = sys.stdin.readline()
    sys.stdout.write("Hello Techgig\n"+x if (len(x) > 1 and len(x) < 10000) else None)
main()