"""
Create a method called search4letters() which searches the given
letters in a phrase and returns them.
E.g.
phrase = 'india is a democratic country'
letters = 'abcde'
Expected output: {'e', 'a', 'd', 'c'}
"""
def search4letters(p,l):
    r = set(p).intersection(set(l))
    return r

p = input("Enter phrase: ")
l= input("Enter letter: ")
print(search4letters(p,l))
