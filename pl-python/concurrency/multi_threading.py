import threading
import time


def main():
    print("Starting main thread...")

    thread_count = 7

    threads = list()
    for i in range(thread_count):
        t = threading.Thread(target=do_stuff, args=(i,))

        threads.append(t)

        t.start()

    for j in range(thread_count):
        threads[j].join()
    print("Finishing main thread...")


#  A working is Target
def do_stuff(number):
    time.sleep(3)
    print("Handling argument: {} parameter by: {}".format(number, threading.currentThread().getName()))

main()
