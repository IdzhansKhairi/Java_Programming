#include <stdio.h>

// Maximum number of processes
#define MAX_PROCESSES 10

// Structure to represent a process
typedef struct {
    int processId;
    int arrivalTime;
    int burstTime;
} Process;

// Function to sort processes based on arrival time
void sortProcessesByArrivalTime(Process processes[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (processes[j].arrivalTime > processes[j + 1].arrivalTime) {
                // Swap processes[j] and processes[j + 1]
                Process temp = processes[j];
                processes[j] = processes[j + 1];
                processes[j + 1] = temp;
            }
        }
    }
}

int main() {
    int n;  // Number of processes
    Process processes[MAX_PROCESSES];  // Array to store processes

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    // Input process details
    for (int i = 0; i < n; i++) {
        printf("Enter the arrival time of process P%d: ", i + 1);
        scanf("%d", &processes[i].arrivalTime);
        printf("Enter the burst time of process P%d: ", i + 1);
        scanf("%d", &processes[i].burstTime);
        processes[i].processId = i + 1;
    }

    sortProcessesByArrivalTime(processes, n);  // Sort processes by arrival time

    int currentTime = 0;  // Current time
    int totalWaitingTime = 0;  // Total waiting time
    int totalTurnaroundTime = 0;  // Total turnaround time

    printf("\nProcess\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time\n");

    // Calculate waiting time and turnaround time for each process
    for (int i = 0; i < n; i++) {
        int waitingTime = currentTime - processes[i].arrivalTime;
        if (waitingTime < 0) {
            waitingTime = 0;
        }

        int turnaroundTime = waitingTime + processes[i].burstTime;

        totalWaitingTime += waitingTime;
        totalTurnaroundTime += turnaroundTime;
        currentTime += processes[i].burstTime;

        printf("P%d\t%d\t\t%d\t\t%d\t\t%d\n", processes[i].processId, processes[i].arrivalTime,
               processes[i].burstTime, waitingTime, turnaroundTime);
    }

    float averageWaitingTime = (float) totalWaitingTime / n;  // Average waiting time
    float averageTurnaroundTime = (float) totalTurnaroundTime / n;  // Average turnaround time

    printf("\nAverage Waiting Time: %.2f\n", averageWaitingTime);
    printf("Average Turnaround Time: %.2f\n", averageTurnaroundTime);

    return 0;
}
