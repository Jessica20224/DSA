#include <iostream>

using namespace std;

int main()
{
   class List {
public:
    // Operations
    virtual bool isEmpty() const = 0;
    virtual int size() const = 0;
    virtual int get(int index) const = 0;
    virtual void insert(int index, int element) = 0;
    virtual void remove(int index) = 0;
    virtual void clear() = 0;
};

}
