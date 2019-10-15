#include <stdio.h>

#include <string.h>

void countWords(char *userin);

int main()

{

char userin[10000];

char ch;

int count = 0;

while ( ( ch=getchar() ) != EOF ){

if(ch=='\n'){

ch = ' ';

}

userin[count] = ch;

count++;

}

if(userin[0]=='\\'){

userin[0]=' ';

}

countWords(userin);

memset(userin,0,10000);

}

void countWords(char *userin)

{

char word[1000][80], result[80];

int counter = 1, i = 0, x = 0, l = 0, m = 0;

//The end of user input once an empty string is entered

for (i = 0; i <= strlen(userin); i++, m++)

{

if (userin[i] == ' ' || userin[i] == '\n' || userin[i] == '\t' || userin[i] == '\0' || (userin[i] >= '1' && userin[i] <= '9') || userin[i] == '-')

{

if (userin[i - 1] == '\n' || userin[i - 1] == '\t' || userin[i - 1] == '\0')

continue;

result[m] = '\0';

m = -1;

//copy the characters

strcpy(word[x++], result);

memset(result, 0, sizeof(result));

}

// translate all the string letters into lowercase letters

if ((userin[i] >= 'A' && userin[i] <= 'Z') || (userin[i] >= 'a' && userin[i] <= 'z'))

{

if ((userin[i] >= 'A') && (userin[i] <= 'Z'))

{

result[i]=userin[i]+32;
}

else

{

result[m] = userin[i];

}

}

}

//sort the string words in alphabetical order

for (i = 0; i < x; i++)

{

for (m = i + 1; m < x; m++)

{

if (strcmp(word[i], word[m]) > 0)

{

strcpy(result, word[i]);

strcpy(word[i], word[m]);

strcpy(word[m], result);

memset(result, 0, sizeof(result));

}

}

}


//count the occurences of each unique word

int swap = 0;

for (i = 0; i < x; i++)

{

strcpy(result, word[i]);

if (result[0] == '\0')

continue;

for (l = 0; l < i; l++)

{

if (!strcmp(result, word[l]))

{

swap = 1;

break;

}

}

if (swap == 1)

{

swap = 0;

continue;

}

//count the occurences

for (m = i + 1; m < x; m++)

{

if (!strcmp(result, word[m]))

{

counter++;

}

}

//Print the sorted words and their occurences

printf("%s %d\n", result, counter);

counter = 1;

}

}