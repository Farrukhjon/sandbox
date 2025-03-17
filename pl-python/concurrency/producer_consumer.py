import Queue
import threading
import time

queue = Queue.Queue()


def main():
    mainThread = threading.currentThread().getName()
    print("Starting main thread: {}".format(mainThread))

    size = 7
    for i in range(size):
        item = i
        queue.put(item)

    for j in range(size):
        worker = threading.Thread(target=do_something, args=(queue,))
        worker.setDaemon(True)
        worker.start()

    queue.join()

    print("Finishing main thread: {}".format(mainThread))


def do_something(aqueue):
    print("Doing something...")
    item = aqueue.get()
    print("Handled: {} by {}".format(item, threading.currentThread().getName()))
    time.sleep(3)
    queue.task_done()


main()
