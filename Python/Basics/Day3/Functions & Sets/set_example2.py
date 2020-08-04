"""
Find out and print the vowels in a given phrase,
and using set, make sure a vowel appearing more than once in phrase
appears only once in result
phrase = 'Zensar Technologies, Pune'
vowels = ['a', 'e', 'i', 'o', 'u']

"""
phrase = 'Zensar Technologies, Pune'
vowels = ['a', 'e', 'i', 'o', 'u']
r = set(phrase).intersection(vowels)
print(r)
