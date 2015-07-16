#include<stdlib.h>
#include<stdio.h>

struct list_el {
   int val;
   struct list_el * next;
};

typedef struct list_el item;

void reverse(item* head){
    item *p = head, *prev = NULL, *n;
    while(p){
        n = p->next;
        p->next = prev;
        if(n == NULL) break;
        prev = p;
        p = n;
    }

   while(p) {
       printf("%d\n", p->val);
       p = p->next ;
   }
}

void main() {
   item *curr, *head;
   int i;

   head = NULL;

   for(i=1;i<=10;i++) {
      curr = (item *)malloc(sizeof(item));
      curr->val = i;
      curr->next  = head;
      head = curr;
   }
   curr = head;
   while(curr) {
      printf("%d\n", curr->val);
      curr = curr->next ;
   }
   printf("----------------\n");
   reverse(head);

}


