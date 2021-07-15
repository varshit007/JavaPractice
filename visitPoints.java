class visitPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0; 
        for (int i = 0; i < points.length - 1; i++ ) {
                int xDist = Math.abs(points[i+1][0]-points[i][0]); 
                int yDist = Math.abs(points[i+1][1]-points[i][1]);
                int diagonalTime = Math.min(xDist, yDist); 
                int remainingTime = Math.abs(xDist - yDist);
                totalTime += diagonalTime + remainingTime; 
        }
        return totalTime; 
    }
}