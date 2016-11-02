package ChatBot;

public class JsonFiles {
    public static String get(String name) {
        if (name.equals("workout.json")) {
            return loadWorkoutJson();
        } else if (name.equals("details.json")) {
            return loadDetailsJson();
        }

        return null;
    }

    private static String loadDetailsJson() {
        return "{\n" +
                "    \"home\": {\n" +
                "        \"description\": \"All you need is a small spot where you fit in while lying. @dips Just follow the list and ask me if you need to know anything. @first\",\n" +
                "        \"@dips\": \"You'll also need a chair, bench or table.\",\n" +
                "        \"@first\": \"An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. \",\n" +
                "    },\n" +
                "    \"outdoor\": {\n" +
                "        \"description\": \"All you need is an spot where you can run and have no problem lying down. @dips Just follow the list and ask me if you need anything. @first\",\n" +
                "        \"@dips\": \"You'll also need a chair, bench or table.\",\n" +
                "        \"@first\": \"An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed. \",\n" +
                "    },\n" +
                "    \"gym\": {\n" +
                "        \"description\": \"All you need is a Bench Press bench with your chosen weight on the barbell plus some light dumbbells. Wanna scale it up? Reserve the next Squat rack with your chosen weight on the barbell, and the next dip bar, also for the Leg Raises. Just follow the list and ask me if you need anything. @first\",\n" +
                "        \"@first\": \"An AMRAP is done as follows: You got a list of some exercises and the number of reps below. After completing all one by one, you've got 1 round done. Complete as many rounds and reps as possible in the time given. Do breaks when needed.\",\n" +
                "    },\n" +
                "};";
    }

    private static String loadWorkoutJson() {
        return "{\"workouts\":[\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 5,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"2 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cjLTke\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"3 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"5 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 10,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"3 mins warmup\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2c6DtQS\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"7 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"7 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 15,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"5 mins Warmup\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"2 minutes Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9gKH\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"10 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"15 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 20,\n" +
                "    \"warmup\": {\n" +
                "        \"time\": \"7 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"13 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"15 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 25,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"15 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"15 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 30,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"20 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 35,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"25 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 40,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 45,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"5 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 50,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\",\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"10 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cool Down Stretch\",\n" +
                "            \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 55,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"13 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ],\n" +
                "        \"cooldown\": {\n" +
                "            \"time\": \"12 mins Cool Down\",\n" +
                "            \"exercises\": [ \n" +
                "            {\n" +
                "                \"name\": \"1 minute Jumping Jack\",\n" +
                "                \"link\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"1 minute Walking in Place\",\n" +
                "                \"link\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"1 minute Jumping Jack\",\n" +
                "                \"link\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"1 minute Walking in Place\",\n" +
                "                \"link\": \"\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Cool Down Stretch\",\n" +
                "                \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "            },\n" +
                "            ]\n" +
                "        }\n" +
                "    },\n" +
                "},\n" +
                "{\n" +
                "    \"locations\": \"home\",\n" +
                "    \"duration\": 60,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"15 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"15 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Jumping Jack\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cool Down Stretch\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 5,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"2 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cjLTke\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"3 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"5 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 10,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"3 mins Warmup\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2c6DtQS\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"7 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"7 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 15,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"5 mins Warmup\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"2 minutes Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9gKH\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"10 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"15 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 20,\n" +
                "    \"warmup\": {\n" +
                "        \"time\": \"7 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"13 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"15 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 25,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"15 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"15 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 30,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"20 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 35,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"25 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 40,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 45,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"5 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Walking\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 50,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"10 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Walking\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cool Down Stretch\",\n" +
                "            \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 55,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"13 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"12 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cool Down Stretch\",\n" +
                "            \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"outdoor\",\n" +
                "    \"duration\": 60,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"15 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },{\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Dips\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Air Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Push-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Sit-Ups\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"15 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Running\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cool Down Stretch\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 5,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"2 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cjLTke\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"3 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"5 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 10,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"3 mins Warmup\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2c6DtQS\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"7 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"7 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 15,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"5 mins Warmup\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"2 minutes Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9gKH\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"10 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"10 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"10 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"10 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"10 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 20,\n" +
                "    \"warmup\": {\n" +
                "        \"time\": \"7 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 minutes Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"13 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 25,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"15 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 30,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"20 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 35,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"25 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": \"40 mins Warmup\",\n" +
                "    \"warmup\":{\n" +
                "        \"time\": 10,\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 45,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"5 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 50,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"10 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"2 minutes Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"10 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute 30 seconds Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cool Down Stretch\",\n" +
                "            \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 55,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"13 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"12 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cool Down Stretch\",\n" +
                "            \"link\": \"http://bit.ly/2cSsQi5\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "    \"locations\": \"gym\",\n" +
                "    \"duration\": 60,\n" +
                "    \"warmup\":{\n" +
                "        \"time\": \"15 mins Warmup\",\n" +
                "        \"exercises\": [\n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Stretching\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"workout\": {\n" +
                "        \"time\": \"30 mins AMRAP\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"20 Mountain Climbers (per leg)\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"15 Bench Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"12 Squats\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"9 Dumbbell Shoulder Presses\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"7 Leg Raises\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"5 Squat Jumps\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"3 Burpees\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        ]\n" +
                "    },\n" +
                "    \"cooldown\": {\n" +
                "        \"time\": \"15 mins Cool Down\",\n" +
                "        \"exercises\": [ \n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Rower\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"1 minute Walking in Place\",\n" +
                "            \"link\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Cool Down Stretch\",\n" +
                "            \"link\": \"http://bit.ly/2cA9txv\"\n" +
                "        },\n" +
                "        ]\n" +
                "    }\n" +
                "},\n" +
                "]\n" +
                "}\n";
    }
}
